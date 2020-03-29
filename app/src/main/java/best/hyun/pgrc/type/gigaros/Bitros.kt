package best.hyun.pgrc.type.gigaros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Bitros : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_bitros)
    override val type: PET_TYPE
        get() = PET_TYPE.GIGAROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_bitros)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 59
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1561
    override val maxLvMaxAtk: Int
        get() = 323
    override val maxLvMaxDef: Int
        get() = 280
    override val maxLvMaxSpd: Int
        get() = 141
    override val initLvMinHp: Int
        get() = 47
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1351
    override val maxLvMinAtk: Int
        get() = 285
    override val maxLvMinDef: Int
        get() = 242
    override val maxLvMinSpd: Int
        get() = 110
    override val minAllGrowth: Double
        get() = 4.465
    override val maxAllGrowth: Double
        get() = 5.172
}