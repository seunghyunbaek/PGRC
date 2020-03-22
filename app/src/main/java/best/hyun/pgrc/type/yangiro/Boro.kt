package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Boro: Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_boro)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_boro)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 75
    override val initLvMaxAtk: Int
        get() = 18
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 10
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1563
    override val maxLvMaxAtk: Int
        get() = 378
    override val maxLvMaxDef: Int
        get() = 228
    override val maxLvMaxSpd: Int
        get() = 219
    override val initLvMinHp: Int
        get() = 59
    override val initLvMinAtk: Int
        get() = 15
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 8
    override val maxLvMinHp: Int
        get() = 1351
    override val maxLvMinAtk: Int
        get() = 339
    override val maxLvMinDef: Int
        get() = 189
    override val maxLvMinSpd: Int
        get() = 187
    override val minAllGrowth: Double
        get() = 4.959
    override val maxAllGrowth: Double
        get() = 5.666
}