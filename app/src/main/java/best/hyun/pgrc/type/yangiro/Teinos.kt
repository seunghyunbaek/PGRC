package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Teinos: Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_teinos)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_teinos)
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
        get() = 65
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1434
    override val maxLvMaxAtk: Int
        get() = 329
    override val maxLvMaxDef: Int
        get() = 260
    override val maxLvMaxSpd: Int
        get() = 183
    override val initLvMinHp: Int
        get() = 50
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1223
    override val maxLvMinAtk: Int
        get() = 290
    override val maxLvMinDef: Int
        get() = 222
    override val maxLvMinSpd: Int
        get() = 152
    override val minAllGrowth: Double
        get() = 4.617
    override val maxAllGrowth: Double
        get() = 5.324
}