package best.hyun.pgrc.type.rare

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Paaran : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_paaran)
    override val type: PET_TYPE
        get() = PET_TYPE.RARE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_paaran)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 70
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 12
    override val maxLvMaxHp: Int
        get() = 1565
    override val maxLvMaxAtk: Int
        get() = 377
    override val maxLvMaxDef: Int
        get() = 215
    override val maxLvMaxSpd: Int
        get() = 266
    override val initLvMinHp: Int
        get() = 56
    override val initLvMinAtk: Int
        get() = 14
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 9
    override val maxLvMinHp: Int
        get() = 1354
    override val maxLvMinAtk: Int
        get() = 338
    override val maxLvMinDef: Int
        get() = 177
    override val maxLvMinSpd: Int
        get() = 235
    override val minAllGrowth: Double
        get() = 5.211
    override val maxAllGrowth: Double
        get() = 5.918
}